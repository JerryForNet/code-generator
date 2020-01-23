package pg.laziji.generator.service;

import pg.laziji.generator.model.Table;

public interface TableService {

    /**
     * 获取表信息
     *
     * @param tableName
     * @return
     * @throws Exception
     */
    Table getTable(String tableName) throws Exception;
}