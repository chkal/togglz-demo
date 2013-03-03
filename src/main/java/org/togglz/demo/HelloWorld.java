package org.togglz.demo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "helloWorld")
@RequestScoped
public class HelloWorld {

    private String name;

    public HelloWorld() {
    }

    public String send() {
        return "worldAnswer.xhtml";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
