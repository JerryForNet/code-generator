package pg.laziji.generator.service;

import pg.laziji.generator.model.TableItem;

/**
 * 自动生成服务
 *
 * @date
 * @author JerryLi
 */
public interface GeneratorService {

    /**
     * 根据表名称生成
     *
     * @param tableNames
     * @param zipPath
     */
    void generateZip(String[] tableNames, String zipPath);

    /**
     * 根据对象生成
     *
     * @param tableItems
     * @param zipPath
     */
    void generateZip(TableItem[] tableItems, String zipPath);
}
