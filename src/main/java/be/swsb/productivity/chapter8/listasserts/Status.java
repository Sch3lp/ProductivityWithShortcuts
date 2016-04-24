package be.swsb.productivity.chapter8.listasserts;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static be.swsb.productivity.chapter8.listasserts.Status.SubStatus.*;

enum Status {

    READY(NOT_REALLY),
    DONE(YA_REALLY),
    WAITING(O_REALLY),
    SOMEWHAT_READY(NOT_REALLY),
    DUNNO(YA_REALLY),
    NOT_READY(NOT_REALLY),
    WHATEVER(YA_REALLY),
    NOT_READY_AT_ALL(NOT_REALLY),
    ;

    private SubStatus subStatus;

    Status(SubStatus subStatus) {
        this.subStatus = subStatus;
    }

    public static List<Status> oReallyStatuses() {
        return Stream.of(values()).filter(Status::isOReally).collect(Collectors.toList());
    }

    public static List<Status> yaReallyStatuses() {
        return Stream.of(values()).filter(Status::isYaReally).collect(Collectors.toList());
    }

    public static List<Status> notReallyStatuses() {
        return Stream.of(values()).filter(Status::isNotReally).collect(Collectors.toList());
    }

    public SubStatus getSubStatus() {
        return subStatus;
    }

    private boolean isOReally() {
        return SubStatus.O_REALLY.equals(getSubStatus());
    }
    private boolean isYaReally() {
        return SubStatus.YA_REALLY.equals(getSubStatus());
    }

    private boolean isNotReally() {
        return SubStatus.NOT_REALLY.equals(getSubStatus());
    }

    enum SubStatus {
        NOT_REALLY,
        O_REALLY,
        YA_REALLY
    }
}
