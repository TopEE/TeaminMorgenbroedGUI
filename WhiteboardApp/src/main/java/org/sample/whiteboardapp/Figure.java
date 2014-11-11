/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sample.whiteboardapp;

import java.io.StringWriter;
import javax.json.JsonObject;
import javax.json.Json;

/**
 *
 * @author Henrik
 */
public class Figure {
    private JsonObject json;

    public Figure() {
    }

    public Figure(JsonObject json) {
        this.json = json;
    }

    public void setJson(JsonObject json) {
        this.json = json;
    }

    public JsonObject getJson() {
        return json;
    }
    
    @Override
    public String toString() {
        StringWriter writer = new StringWriter();
        Json.createWriter(writer).write(json);
        return writer.toString();
    }
}