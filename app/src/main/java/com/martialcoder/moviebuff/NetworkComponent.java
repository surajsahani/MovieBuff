package com.martialcoder.moviebuff;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, })
public class NetworkComponent {
}
