public class CustomerSupport {
    private int supportId;
    private int clientId;
    private String issue;
    private String resolution;

    public CustomerSupport(int supportId, int clientId, String issue, String resolution) {
        this.supportId = supportId;
        this.clientId = clientId;
        this.issue = issue;
        this.resolution = resolution;
    }

    // Getters and setters
    public int getSupportId() {
        return supportId;
    }

    public void setSupportId(int supportId) {
        this.supportId = supportId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "CustomerSupport{" +
                "supportId=" + supportId +
                ", clientId=" + clientId +
                ", issue='" + issue + '\'' +
                ", resolution='" + resolution + '\'' +
                '}';
    }
}
