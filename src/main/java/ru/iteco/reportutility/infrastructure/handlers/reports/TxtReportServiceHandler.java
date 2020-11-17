package ru.iteco.reportutility.infrastructure.handlers.reports;

import ru.iteco.reportutility.services.ReportService;
import ru.iteco.reportutility.services.TxtReportService;
import ru.iteco.reportutility.services.XlsxReportService;

/**
 * 17.11.2020
 *
 * @author a.chernyavskiy0n
 */
public class TxtReportServiceHandler extends ReportHandler {

    public TxtReportServiceHandler(ReportHandler handler) {
        super(handler);
    }

    @Override
    public ReportService peek(String[] args) throws Exception {
        if (args[0].endsWith(".txt")) {
            return new TxtReportService(args);
        }
        return super.peek(args);
    }
}
