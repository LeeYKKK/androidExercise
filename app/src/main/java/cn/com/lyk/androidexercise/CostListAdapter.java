package cn.com.lyk.androidexercise;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import cn.com.lyk.been.CostBeen;

/**
 * Created by LeeYK on 2017/10/17.
 */

public class CostListAdapter extends BaseAdapter {
    private List<CostBeen> mList;
    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public CostListAdapter(Context context, List<CostBeen> list) {
        mContext = context;
        mList = list;
        mLayoutInflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView=mLayoutInflater.inflate(R.layout.layout_item,null);
            viewHolder.mTvCostTitle= (TextView) convertView.findViewById(R.id.tvTile);
            viewHolder.mTvCostDate= (TextView) convertView.findViewById(R.id.tvDate);
            viewHolder.mTvCostMoney= (TextView) convertView.findViewById(R.id.tvMoney);
            convertView.setTag(viewHolder);

        }else{
            viewHolder= (ViewHolder) convertView.getTag();

        }
        CostBeen costBeen=mList.get(position);
        viewHolder.mTvCostTitle.setText(costBeen.getCostTite());
        viewHolder.mTvCostDate.setText(costBeen.getCostDate());
        viewHolder.mTvCostMoney.setText(costBeen.getCostMoney());

        return convertView;
    }

    private static class ViewHolder {
        public TextView mTvCostTitle;
        public TextView mTvCostDate;
        public TextView mTvCostMoney;
    }
}
