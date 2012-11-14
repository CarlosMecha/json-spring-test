/**
 * Copyright (c) 2012 Owl Systems. All rights reserved.
 * 
 * This program and the accompanying materials are made under the
 * terms of the Owl Distribution License v. 1.0 which accompanies this distribution.
 * The Owl Distribution License is available at
 * http://www.owl-systems.com/legal/odl-v10.html
 * 
 */
package org.carlosmecha.test.json;

/**
 * @author Carlos Mecha
 * 
 */
public class JSONTest {

    private long id;

    private String name;

    private String comment;

    /**
     * 
     */
    public JSONTest() {
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment
     *            the comment to set
     */
    public void setComment(final String comment) {
        this.comment = comment;
    }

}
