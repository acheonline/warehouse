package ru.iteco.reportutility.infrastructure.handlers.reports;

import ru.iteco.reportutility.services.ReportService;

/**
 * 17.11.2020
 *
 * @author a.chernyavskiy0n
 */
public class ErrorReportServiceHandler extends ReportHandler {
    public ErrorReportServiceHandler(ReportHandler handler) {
        super(handler);
    }

    @Override
    public ReportService peek(String[] args) throws Exception {
        var fileExt = args[0];
        if (!fileExt.endsWith(".xlsx") || !fileExt.endsWith(".csv") || !fileExt.endsWith(".txt")) {
            throw new Exception(fileExt + " not supported");
        }
        return super.peek(args);
    }
}
