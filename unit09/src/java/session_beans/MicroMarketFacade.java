/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session_beans;

import entities.MicroMarket;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author syuan
 */
@Stateless
public class MicroMarketFacade extends AbstractFacade<MicroMarket> {

    @PersistenceContext(unitName = "unit09PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MicroMarketFacade() {
        super(MicroMarket.class);
    }
    
}
