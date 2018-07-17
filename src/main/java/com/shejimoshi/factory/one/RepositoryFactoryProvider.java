package com.shejimoshi.factory.one;

public interface RepositoryFactoryProvider {
    Repository create();
}
class DatabaseRepositoryFactory implements RepositoryFactoryProvider {
    @Override
    public Repository create() {
        return new DatabaseRepository();
    }
}
class CacheRepositoryFactory implements RepositoryFactoryProvider {
    @Override
    public Repository create() {
        return new CacheRepository();
    }
}
class FileRepositoryFactory implements RepositoryFactoryProvider {
    @Override
    public Repository create() {
        return new FileRepository();
    }
}
