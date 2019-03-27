package com.ankuran.ui.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

import com.ankuran.R;
import com.ankuran.ui.adaptar.TabAdapter;
import com.ankuran.ui.fragment.PayoutReportFragment;
import com.ankuran.ui.fragment.SettlementReportFragment;

public class PayoutReportActivity extends BaseActivity  {


    private TabAdapter mTabAdaptor;
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected int getContentViewId() {
        return R.layout.activity_payout_report;
    }

    @Override
    protected void onCreateActivity(Bundle bundle) {
        initUI();

    }

    private void initUI() {
        viewPager =  findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        mTabAdaptor = new TabAdapter(getSupportFragmentManager());
        mTabAdaptor.addFragment(new PayoutReportFragment(), "Payout");
        mTabAdaptor.addFragment(new SettlementReportFragment(), "Settlement");
        viewPager.setAdapter(mTabAdaptor);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    protected void onResume() {
        super.onResume();
    }



}
