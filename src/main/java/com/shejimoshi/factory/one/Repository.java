package com.shejimoshi.factory.one;

public interface Repository {
    void save(Object o);
}
class DatabaseRepository implements Repository {
    public void save(Object obj) {
        System.out.println("save in database");
    }
}
class CacheRepository implements Repository {

    public void save(Object obj) {
        System.out.println("save in cache");
    }
}
class FileRepository implements Repository {
    public void save(Object obj) {
        System.out.println("save in file");
    }
}