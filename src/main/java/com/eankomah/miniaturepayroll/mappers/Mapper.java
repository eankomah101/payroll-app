package com.eankomah.miniaturepayroll.mappers;

public interface Mapper <U,T>{
    U mapToEntity(T value);

    T mapFromEntity(U value);
}
