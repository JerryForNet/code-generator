package pg.laziji.generator.model;

import lombok.Data;
import org.apache.commons.lang.WordUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

@Data
public class Table {

    private String tableName;
    private String tableType;
    private String tableComment;
    private List<Column> columns;

    public String getClassName() {
        if (tableName == null) {
            return null;
        }
        return WordUtils.capitalizeFully(tableName.toLowerCase(), new char[]{'_'})
                .replace("_", "");
    }

    public String getLowercaseClassName() {
        return StringUtils.uncapitalize(getClassName());
    }
}
