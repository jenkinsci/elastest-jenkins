package jenkins.plugins.elastest.json;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import hudson.EnvVars;
import hudson.FilePath;
import jenkins.plugins.elastest.ElasTestWriter;

public class ElasTestBuild implements Serializable {
    private static final long serialVersionUID = 1L;

    private transient FilePath workspace;

    private ExternalJob externalJob;

    private List<String> containers;

    private transient ElasTestWriter writer;

    private String eimAgentId;

    private EnvVars envVars;

    public ElasTestBuild() {
        this(null);
    }

    public ElasTestBuild(ExternalJob externalJob) {
        super();
        this.externalJob = externalJob;
        this.containers = new ArrayList<>();
        this.envVars = new EnvVars();
    }

    public ExternalJob getExternalJob() {
        return externalJob;
    }

    public void setExternalJob(ExternalJob externalJob) {
        this.externalJob = externalJob;
    }

    public FilePath getWorkspace() {
        return workspace;
    }

    public void setWorkspace(FilePath workspace) {
        this.workspace = workspace;
    }

    public List<String> getContainers() {
        return containers;
    }

    public void setContainers(List<String> containers) {
        this.containers = containers;
    }

    public ElasTestWriter getWriter() {
        return writer;
    }

    public void setWriter(ElasTestWriter writer) {
        this.writer = writer;
    }

    public String getEimAgentId() {
        return eimAgentId;
    }

    public void setEimAgentId(String eimAgentId) {
        this.eimAgentId = eimAgentId;
    }

    public EnvVars getEnvVars() {
        return envVars;
    }

    public void setEnvVars(EnvVars envVars) {
        this.envVars = envVars;
    }

}
