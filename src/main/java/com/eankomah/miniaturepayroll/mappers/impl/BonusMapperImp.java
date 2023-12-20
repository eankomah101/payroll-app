package com.eankomah.miniaturepayroll.mappers.impl;

import com.eankomah.miniaturepayroll.dto.CreatingBonus;
import com.eankomah.miniaturepayroll.entity.payroll.Bonus;
import com.eankomah.miniaturepayroll.mappers.BonusMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class BonusMapperImp implements BonusMapper<Bonus, CreatingBonus> {

    private final ModelMapper modelMapper;

    @Override
    public Bonus mapToEntity(CreatingBonus value) {
        return modelMapper.map(value, Bonus.class);
    }

    @Override
    public CreatingBonus mapFromEntity(Bonus value) {
        return modelMapper.map(value, CreatingBonus.class);
    }
}
