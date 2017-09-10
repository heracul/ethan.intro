package ethan.web.intro.board.vo;

public class BoardVO {
    private String id;
    private String title;
    private String contents;
    private String fileId;
    private String crtUserId;
    private String crtTm;
    private String uptUserId;
    private String uptTm;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getCrtUserId() {
        return crtUserId;
    }

    public void setCrtUserId(String crtUserId) {
        this.crtUserId = crtUserId;
    }

    public String getCrtTm() {
        return crtTm;
    }

    public void setCrtTm(String crtTm) {
        this.crtTm = crtTm;
    }

    public String getUptUserId() {
        return uptUserId;
    }

    public void setUptUserId(String uptUserId) {
        this.uptUserId = uptUserId;
    }

    public String getUptTm() {
        return uptTm;
    }

    public void setUptTm(String uptTm) {
        this.uptTm = uptTm;
    }
}
