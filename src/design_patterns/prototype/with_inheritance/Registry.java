package design_patterns.prototype.with_inheritance;

import java.util.HashMap;
import java.util.Map;

public class Registry<V> {

    private Map<String, V> registry = new HashMap<>();

    public void register(String key, V val){
        registry.put(key, val);
    }

    public V get(String key){
        return registry.get(key);
    }
}
