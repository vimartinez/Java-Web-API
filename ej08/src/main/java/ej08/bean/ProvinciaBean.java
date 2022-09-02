package ej08.bean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@ManagedBean
@SessionScoped
public class ProvinciaBean {
	
	private static final String URLLISTAPROVINCIAS = "https://apis.datos.gob.ar/georef/api/provincias?campos=id,nombre";
	private static final String URLLISTADEPARTAMENTOS = "https://apis.datos.gob.ar/georef/api/departamentos?provincia=";
	
	JSONObject jsonObject = new JSONObject();
	JSONArray jsonArray;
	
	private List<SelectItem> listaProvincias;
	private String provinciaSelect;
	private List<String> listaDepartamentos;
	
	public ProvinciaBean() {
		
		listaProvincias = new ArrayList<SelectItem>();
		
		OkHttpClient httpClient = new OkHttpClient();
		Request request = new Request.Builder().url(URLLISTAPROVINCIAS).build();
		Call call= httpClient.newCall(request);
		Response response;
		JSONObject jsonObject = null;
		try {
			response = call.execute();
			jsonObject = new JSONObject(response.body().string());
			if(jsonObject.getInt("cantidad") > 0) {
				jsonArray = jsonObject.getJSONArray("provincias");
				for (int i=0;i<jsonArray.length();i++) {
					listaProvincias.add(new SelectItem(jsonArray.getJSONObject(i).getInt("id"),jsonArray.getJSONObject(i).getString("nombre")));
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<SelectItem> getListaProvincias() {
		return listaProvincias;
	}

	public void setListaProvincias(List<SelectItem> listaProvincias) {
		this.listaProvincias = listaProvincias;
	}

	public String getProvinciaSelect() {
		return provinciaSelect;
	}

	public void setProvinciaSelect(String provinciaSelect) {
		this.provinciaSelect = provinciaSelect;
	}

	public List<String> getListaDepartamentos() {
		return listaDepartamentos;
	}

	public void setListaDepartamentos(List<String> listaDepartamentos) {
		this.listaDepartamentos = listaDepartamentos;
	}
	
	public void buscarDepartamentos() {
		System.out.println("Provincia elegida:"+provinciaSelect);
		
		listaDepartamentos = new ArrayList<String>();
		OkHttpClient httpClient = new OkHttpClient();
		Request request = new Request.Builder().url(URLLISTADEPARTAMENTOS+provinciaSelect+"&max=500").build();
		Call call= httpClient.newCall(request);
		Response response;
		JSONObject jsonObject = null;
		try {
			response = call.execute();
			jsonObject = new JSONObject(response.body().string());
			if(jsonObject.getInt("cantidad") > 0) {
				jsonArray = jsonObject.getJSONArray("departamentos");
				for (int i=0;i<jsonArray.length();i++) {
					listaDepartamentos.add(jsonArray.getJSONObject(i).getString("nombre"));
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
