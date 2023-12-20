package com.eankomah.miniaturepayroll.mappers;

public interface BonusMapper<U,T>{
    U mapToEntity(T value);

    T mapFromEntity(U value);
}
