//package com.jesse.reactiveWebDemo.repository;
//
//import com.jesse.reactiveWebDemo.domain.Man;
//import org.springframework.stereotype.Repository;
//
//import java.util.Collection;
//import java.util.concurrent.ConcurrentHashMap;
//import java.util.concurrent.ConcurrentMap;
//import java.util.concurrent.atomic.AtomicLong;
//
//@Repository
//public class ManRepository {
//
//    private ConcurrentMap<Long, Man> repository = new ConcurrentHashMap<>();
//
//
//    private static final AtomicLong idGenerator = new AtomicLong(0);
//
//    public Long save(Man man) {
//        Long id = idGenerator.incrementAndGet();
//        man.setId(id);
//        repository.put(id, man);
//        return id;
//    }
//
//    public Collection<Man> findAll() {
//        return repository.values();
//    }
//
//
//    public Man findById(Long id) {
//        return repository.get(id);
//    }
//
//    public Long update(Man man) {
//        repository.put(man.getId(), man);
//        return man.getId();
//    }
//
//    public Long delete(Long id) {
//        repository.remove(id);
//        return id;
//    }
//
//}
