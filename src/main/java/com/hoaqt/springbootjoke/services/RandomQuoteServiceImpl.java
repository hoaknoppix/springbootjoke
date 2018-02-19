package com.hoaqt.springbootjoke.services;

import org.springframework.stereotype.Service;
import guru.springframewo

@Service
public class RandomQuoteServiceImpl implements RandomQuoteService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public RandomQuoteServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getRandomQuote() {
        return null;
    }
}
