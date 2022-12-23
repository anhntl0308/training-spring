package com.example.demomapstruct.service;

import com.example.demomapstruct.dto.AbstractDTO;
import com.example.demomapstruct.dto.PageObject;
import com.example.demomapstruct.entity.AbstractEntity;
import com.example.demomapstruct.mapper.AbstractMapper;
import com.example.demomapstruct.repository.AbstractRepository;
import org.springframework.data.domain.Pageable;

public interface AbstractService<T extends AbstractEntity, E extends AbstractDTO> {

    E create(E dto);

    PageObject<E> get(Pageable pageable);

    E update(E dto);

    E delete(E dto);

    void setAbstractMapper(AbstractMapper<T, E> abstractMapper);

    AbstractMapper<T, E> getAbstractMapper();
    void setAbstractRepository(AbstractRepository<T> abstractRepository);

    AbstractRepository<T> getAbstractRepository();


}
