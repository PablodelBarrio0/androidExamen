## Ejemplo de uso de Fragmentos estáticos
En este caso, los fragmentos que se cargan en la Actividad se especifican directamente en el código. 

En este ejemplo:
 - En  activity_main.xml tenemos dos Views de tipo \<fragment\>.
 - Cada \<fragment\> tiene en su propiedad android:name la ruta cualificada del fragmento que contiene:
```
    <fragment
        android:id="@+id/counter_fragment"
        android:name="com.mpd.pmdm.fragmentintro.CounterFragment"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="2"/>
    <fragment
        android:id="@+id/color_fragment"
        android:name="com.mpd.pmdm.fragmentintro.ColorFragment"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        />
```