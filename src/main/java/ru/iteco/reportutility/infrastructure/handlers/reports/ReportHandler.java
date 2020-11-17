package ru.iteco.reportutility.infrastructure.handlers.reports;

import ru.iteco.reportutility.services.ReportService;

/**
 * 17.11.2020
 *
 * @author a.chernyavskiy0n
 */
public abstract class ReportHandler {
    private ReportHandler nextHandler;

    protected ReportHandler (ReportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public ReportService peek(String[] args) throws Exception {
        return nextHandler.peek(args);
    }
}
