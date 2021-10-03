package co.tinode.tindroid.format;

import android.content.Context;
import android.util.Log;
import android.widget.TextView;

import java.util.Map;

import co.tinode.tindroid.UiUtils;

public class ReplyFormatter extends QuoteFormatter {
    public ReplyFormatter(TextView container, SpanFormatter.ClickListener clicker) {
        super(container.getContext(), container.getTextSize(), UiUtils.QUOTED_REPLY_LENGTH, clicker);
    }

    @Override
    protected MeasuredTreeNode handleQuote(Context ctx, Map<String, Object> data, Object content) {
        MeasuredTreeNode quote = new MeasuredTreeNode(SpanFormatter.handleQuote_Impl(ctx, content), UiUtils.QUOTED_REPLY_LENGTH);
        Log.i("ReplyFormatter", "Quote: " + quote.toString());
        return quote;
    }
}

