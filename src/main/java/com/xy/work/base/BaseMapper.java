package com.xy.work.base;

import org.springframework.dao.DataAccessException;

import java.util.List;

public interface BaseMapper<T,ID> {

    public Integer insertSelective(T entity) throws DataAccessException;

    public Integer insertHasKey(T entity) throws DataAccessException;

    public Integer insertBatch(List<T> entities) throws DataAccessException;

    public T selectByPrimaryKey(ID id) throws DataAccessException;

    public List<T> selectByParams(BaseQuery baseQuery) throws DataAccessException;

    public Integer updateByPrimaryKeySelective(T entity) throws DataAccessException;

    public Integer updateBatch(List<T> entities) throws DataAccessException;

    public Integer deleteByPrimaryKey(ID id) throws DataAccessException;

    public Integer deleteBatch(ID[] ids) throws DataAccessException;

}
