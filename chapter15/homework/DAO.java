package homework;

import java.util.*;

/**
 * @Author: EzioHe
 * @Date: 2023/5/1 23:22
 */
public class DAO<T> {
    private Map<String, T> map = new HashMap<>();

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    //遍历 map ，将 map 的所有 value(T entity) 封装到 ArrayList 返回即可
    public List<T> list() {
        //创建一个 ArrayList
        List<T> list = new ArrayList<>();
        //遍历Map
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            list.add(map.get(key));
        }
        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }

    public void save(String id,T entity){
        map.put(id,entity);
    }
}