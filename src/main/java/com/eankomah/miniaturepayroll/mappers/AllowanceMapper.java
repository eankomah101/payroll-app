package com.eankomah.miniaturepayroll.mappers;

public interface AllowanceMapper <A,B>{
    A mapsToEntity (B value);

    B mapsFromEntity (A value);
}
