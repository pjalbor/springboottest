package org.palbor;

public class Country implements Runnable{
    private String name;

    public Country(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name+" ocurrence of letter a:"+name.indexOf('a'));
    }
}
