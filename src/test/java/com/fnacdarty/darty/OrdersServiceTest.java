package com.fnacdarty.darty;

import org.junit.Test;

public class OrdersServiceTest {

    public OdersService odersService = new OdersService(new InMemoryOrdersDao());


    //1-  lister toutes les commandes d'un client
    // pour identifier un client il faut utiliser le ownerName de la commande
    @Test
    public void should_return_orders_given_ownerName() {

    }


    //2-  lister toutes les commandes en cours de livraison (status delivery in progress)

    @Test
    public void should_return_all_orders_to_deliver() {

    }

    //3- annuler la commande d'un client
    //
    @Test
    public void should_cancel_an_order() {

    }


    //4- Bon assez joué on doit aller en prod quel refacto ou évolution vous proposez pour pouvoir récupérer les commandes depuis une base de données ?


    //5- Est-ce-que vous pensez qu'on pourrait avoir un problème de perf ? Si oui que peut on faire pour améliorer les perfs
}
