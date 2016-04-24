package be.swsb.productivity.chapter8.listasserts;

import org.junit.Test;

import static be.swsb.productivity.chapter8.listasserts.Status.*;
import static org.assertj.core.api.Assertions.assertThat;

public class StatusTest {

    @Test
    public void oReallyStatuses_ContainsOnlyWAITING() throws Exception {
        assertThat(Status.oReallyStatuses()).containsExactly(WAITING);
    }

    @Test
    public void notReallyStatuses_ContainStatusesWithSubStatus_NOT_REALLY() throws Exception {
        // assert notReallyStatuses contain the expected Statuses
        assertThat(Status.notReallyStatuses()).containsOnly();
    }

    // Write your own test called yaReallyStatuses_ContainOnlyDoneAndDunno using alt+insert
}