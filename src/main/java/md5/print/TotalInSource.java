package md5.print;

import lombok.ToString;
import md5.stage1sourcesdata.Source;

@ToString
public class TotalInSource {
    public Source source;
    public int totalFiles;
    public int totalFolders;
    public long totalSize;

    public TotalInSource(Source source) {
        this.source = source;
    }
}
