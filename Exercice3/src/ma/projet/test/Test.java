/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.Date;
import ma.projet.entity.Projet;
import ma.projet.service.ProjetService;
import ma.projet.util.HibernateUtil;
import org.hibernate.Hibernate;
import java.util.List;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author hachem safae
 */
public class Test {
    
    public static void main(String[] args) {
      HibernateUtil.getSessionFactory();
    }
}