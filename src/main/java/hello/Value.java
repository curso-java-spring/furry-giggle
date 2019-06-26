package hello;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    private Long id;
    private String phrase;
    

    public Value() {
    }

    public Long getId() {
        return this.id;
    }

    public LocalDate getDate() {
    	return null;
    }
     
    @JsonProperty("quote")
    public String getPhrase() {
        return this.phrase;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("quote")
    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", phrase='" + phrase + '\'' +
                '}';
    }
}