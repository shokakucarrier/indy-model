package org.commonjava.event.storage;

import java.util.Set;

public class BatchCleanupResult
{
    private Set<String> succeeded;

    private Set<String> failed;

    public BatchCleanupResult()
    {
    }

    public Set<String> getSucceeded()
    {
        return succeeded;
    }

    public void setSucceeded(Set<String> succeeded)
    {
        this.succeeded = succeeded;
    }

    public Set<String> getFailed()
    {
        return failed;
    }

    public void setFailed(Set<String> failed)
    {
        this.failed = failed;
    }

    @Override
    public String toString() {
        return "BatchCleanupResult{" +
                "succeeded=" + succeeded +
                ", failed=" + failed +
                '}';
    }
}