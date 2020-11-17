package ru.iteco.reportutility.infrastructure.handlers.reports;

import ru.iteco.reportutility.services.CsvReportService;
import ru.iteco.reportutility.services.ReportService;
import ru.iteco.reportutility.services.XlsxReportService;

/**
 * 17.11.2020
 *
 * @author a.chernyavskiy0n
 */
public class XlslReportServiceHandler extends ReportHandler {

    public XlslReportServiceHandler(ReportHandler handler) {
        super(handler);
    }

    @Override
    public ReportService peek(String[] args) throws Exception {
        if (args[0].endsWith(".xlsx")) {
            return new XlsxReportService(args);
        }
        return super.peek(args);
    }
}
