/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhcity.DAO;

import java.util.List;

/**
 *
 * @author SuongNguyen
 * @param <Entity>
 * @param <Key>
 */
public abstract class DAO<Entity, Key> {
    public abstract void insert(Entity entity);
    public abstract void update(Entity entity);
    public abstract void delete(Key id);
    public abstract Entity selectById(Key id);
    public abstract List<Entity> selectAll();
    public abstract List<Entity> selectBySQL(String sql, Object...x);
}
