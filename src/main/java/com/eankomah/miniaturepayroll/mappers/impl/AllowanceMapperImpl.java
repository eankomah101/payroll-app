package com.eankomah.miniaturepayroll.mappers.impl;

import com.eankomah.miniaturepayroll.dto.CreatingAllowance;
import com.eankomah.miniaturepayroll.entity.payroll.Allowance;
import com.eankomah.miniaturepayroll.mappers.AllowanceMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AllowanceMapperImpl implements AllowanceMapper<Allowance, CreatingAllowance> {
    private final ModelMapper modelMapper;

    @Override
    public Allowance mapsToEntity(CreatingAllowance value) {
        return modelMapper.map(value, Allowance.class);
    }

    @Override
    public CreatingAllowance mapsFromEntity(Allowance value) {
        return modelMapper.map(value, CreatingAllowance.class);
    }
}
