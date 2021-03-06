/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.mvictor.dao;

import br.app.mvictor.entidade.Pessoa;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author mvictor
 * @param <T> - a classe entidade.
 */
public class DAO <T extends Pessoa>{
    
    /**
     *
     */
    
    /**
    */
    protected static EntityManager em;

    /**
     * Aqui iremos mapear literalmente as entidade, para criar as tabela,
     * se as tabelas já existir, ele apenas irá usar a tabela.
    */
    static {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("base");
        em = emf.createEntityManager();
    }
    
    /**
     * Função que retorna a entidade com o valor do id passado por paramêtro.
     * @param id = o valor id da linha.
     * @return getById(id) - retorna uma linha da tabela, com o valor do [id] passado,
     * por parametro.
     */
    public T getById(long id)
    {
        return (T)em.find(getTypeClass(), id);
    }
    
    /**
     * Método responsável por persistir as informações.
     * @param entidade - A classe entidade que recebe as informações.
     */
    public void inserir(T entidade)
    {
        try{
            em.getTransaction().begin();
            em.persist(entidade);
            em.getTransaction().commit();
        }
        catch(Exception ex)
        {
            em.getTransaction().rollback();
        }   
    }
    
    /**
     * Método responsável por atualizar as informações na base de dados.
     * @param entidade - a classe entidade que recebeu as informações.
     */
    public void atualizar(T entidade)
    {
        try{
            em.getTransaction().begin();
            em.merge(entidade);
            em.getTransaction().commit();
        }
        catch(Exception ex)
        {
            em.getTransaction().rollback();
        }
    }
    
    /**
     * Método responsável por remover uma linha da tabela,
     * especificada pelo usuário.
     * @param entidade - a classe entidade que recebeu as informações.
     */
    public void remover(T entidade)
    {
        try{
            entidade = getById(entidade.getMatricula());
            em.getTransaction().begin();
            em.remove(entidade);
            em.getTransaction().commit();
        }
        catch(Exception ex)
        {
            em.getTransaction().rollback();
        }
    }
    
   
    /**
     * Método que retorna uma lista com as informações.
     * @return findAll() - retorna uma lista com as informações na base de dados.
    */
    
    public List<T> findAll()
    {
        return em.createQuery(" FROM "+getTypeClass().getName()).getResultList();
    }
    
    /**
     * Método que verifica se um valor do id, consta na tabela.
     * @param id - o valor do id da tabela.
     */
    public boolean verificarId(long id)
    {
        List<T> lista = em.createQuery(" FROM "+getTypeClass().getName()).getResultList();
        for(T entidade: lista)
        {
            if(entidade.getMatricula() == id){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Função encabida em converter para o tipo de classe.
     */
    private Class<?> getTypeClass()
    {
        Class<?> minhaClasse = (Class<?>) ((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return minhaClasse;
    }
}
