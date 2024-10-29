package com.suni.review.repository;

import com.suni.review.model.TestEntity;

import java.util.List;

public interface TestRepositoryCustom {
    public List<TestEntity> findAllByNameByQuerydsl(String name);
}
