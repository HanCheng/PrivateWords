package com.hancheng.privatewords.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hancheng.privatewords.R;
import com.hancheng.privatewords.models.PrivateMessage;

import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.format.PeriodFormatterBuilder;

import java.util.List;

/**
 * Created by chan on 4/29/15.
 */
public class ContentResultsAdapter extends ArrayAdapter<PrivateMessage> {

    private Context mContext;
    private LayoutInflater mInflater;
    private List<PrivateMessage> mMessageList;

    public ContentResultsAdapter(Context context, List<PrivateMessage> messageList) {
        super(context, R.layout.results_item_row, messageList);
        mContext = context;
        mInflater = LayoutInflater.from(context);
        mMessageList = messageList;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        PrivateMessage message = mMessageList.get(position);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.results_item_row, parent, false);
            holder = new ViewHolder();
            holder.mMessageText = (TextView) convertView.findViewById(R.id.private_word_content);
            holder.mUserName = (TextView) convertView.findViewById(R.id.user_name);
            holder.mPostTimeElapsed = (TextView) convertView.findViewById(R.id.post_time_elapsed);
            holder.mCommentsIcon = (ImageView) convertView.findViewById(R.id.comments_icon);
            holder.mCommentsNumber = (TextView) convertView.findViewById(R.id.comments_number);
            holder.mPostIcon = (ImageView) convertView.findViewById(R.id.posted_icon);
            holder.mPostNumber = (TextView) convertView.findViewById(R.id.posted_number);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        if (message != null) {
            holder.mUserName.setText(message.getUser().getUserName());
            holder.mPostNumber.setText(message.getUser().getPostedNumber());
            Period period = new Period(message.getSentTime(), DateTime.now());
            PeriodFormatterBuilder formatterBuilder = new PeriodFormatterBuilder()
                    .appendPrefix("posted");
            if (period.getMonths() != 0) {
                formatterBuilder.appendMonths().appendSuffix("month ago");
            } else if (period.getWeeks() != 0) {
                formatterBuilder.appendWeeks().appendSuffix("weeks ago");
            } else if (period.getDays() != 0) {
                formatterBuilder.appendDays().appendSuffix("days ago");
            } else if (period.getHours() != 0) {
                formatterBuilder.appendHours().appendSuffix("hours ago");
            } else if (period.getMinutes() != 0) {
                formatterBuilder.appendMinutes().appendSuffix("minutes ago");
            } else if (period.getSeconds() != 0) {
                formatterBuilder.appendSeconds().appendSuffix("seconds ago");
            }
            // elapsed time and comments number should be updated
            // reference : http://stackoverflow.com/a/3727813
            holder.mPostTimeElapsed.setText(formatterBuilder.printZeroNever().toFormatter().print(period));
            holder.mCommentsNumber.setText(message.getCommentsNumber());
        }
        return convertView;
    }

    static class ViewHolder {
        TextView mMessageText;
        TextView mUserName;
        TextView mPostTimeElapsed;
        ImageView mCommentsIcon;
        TextView mCommentsNumber;
        ImageView mPostIcon;
        TextView mPostNumber;
    }
}
