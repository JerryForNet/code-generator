package pg.laziji.generator.model;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;


@Data
public class TableItem {

    private String tableName;
    private Map<String, String> dynamicPathVariables = new HashMap<>();
    private Map<String, Object> templateVariables = new HashMap<>();

    public static Builder newBuilder() {
        return new Builder();
    }

    public TableItem() {

    }

    public TableItem(String tableName) {
        this.tableName = tableName;
    }


    public static class Builder {

        private TableItem item = new TableItem();

        public Builder tableName(String tableName) {
            item.setTableName(tableName);
            return this;
        }

        public Builder dynamicPathVariable(String key, String value) {
            item.getDynamicPathVariables().put(key, value);
            return this;
        }

        public Builder templateVariable(String key, Object value) {
            item.getTemplateVariables().put(key, value);
            return this;
        }

        public TableItem build() {
            return item;
        }
    }
}
