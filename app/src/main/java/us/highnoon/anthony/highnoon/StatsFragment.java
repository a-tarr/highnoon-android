package us.highnoon.anthony.highnoon;

import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

/**
 * Created by Anthony on 17/08/2016.
 */
public class StatsFragment extends Fragment {
    TextView details;
    Handler handler;
    private static final String OVERWATCH_API = "https://owapi.net/api/v2/u/bapplebo-1602/stats/general";

    public StatsFragment() {
        handler = new Handler();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_stats, container, false);
        details = (TextView)rootView.findViewById(R.id.details);

        return rootView;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getUsers();
    }

//    //this works at least
//    public void getUsers() {
//        RequestQueue queue = Volley.newRequestQueue(getActivity());
//        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, OVERWATCH_API, null,
//            new Response.Listener<JSONObject>() {
//                @Override
//                public void onResponse(JSONObject response) {
//                    TextView details = (TextView)getView().findViewById(R.id.details);
//                    details.setText(response.toString());
//                }
//            },
//            new Response.ErrorListener() {
//                @Override
//                public void onErrorResponse(VolleyError error) {
//
//                }
//            });
//        queue.add(jsonObjectRequest);
//    }
}
