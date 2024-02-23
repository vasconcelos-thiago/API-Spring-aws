package com.example.apispring.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Book {
    public String titulo;
    public String autor;
    @JsonProperty("numero_paginas")
    public int numeroDePaginas;
    @JsonProperty("data_lancamento")
    public String dataLancamento;


}
