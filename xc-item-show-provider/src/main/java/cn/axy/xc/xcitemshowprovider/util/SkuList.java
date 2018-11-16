package cn.axy.xc.xcitemshowprovider.util;

import cn.axy.xc.xcitemshowprovider.dao.impl.*;
import cn.axy.xc.xcitemshowprovider.pojo.*;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class SkuList {
    @Autowired
    private AppliancesSolrdao appliancesSolrdao;
    @Autowired
    private ClothingSolrimpl clothingSolrimpl;
    @Autowired
    private Cossolrimpl cossolrimpl;
    @Autowired
    private FooSolrimpl fooSolrimpl;
    @Autowired
    private OrnSolrimpl ornSolrimpl;
    Map<String,List<String>> skumap = new HashMap<>();
    List<String> skucolorlist = new ArrayList<String>();
    List<String> skusizelist = new ArrayList<String>();
    List<String> skumlist = new ArrayList<>();
    List<String> skualist = new ArrayList<>();
    public String appsolr(Skusolr skusolr) throws Exception {
        List<Appliances> appliances = appliancesSolrdao.searchProduct(skusolr);
        for (Appliances app:appliances) {
            String getaColor = app.getaColor();
            skucolorlist.add(getaColor);
            for  ( int  i = 0 ; i < skucolorlist.size() - 1 ; i ++ )  {
                for  ( int j = skucolorlist.size() - 1 ; j > i; j -- )  {
                    if  (skucolorlist.get(j).equals(skucolorlist.get(i)))  {
                        skucolorlist.remove(j);
                    }
                }
            }
            String getaSize = app.getaSize();
            skusizelist.add(getaSize);
            for  ( int  i = 0 ; i < skusizelist.size() - 1 ; i ++ )  {
                for  ( int j = skusizelist.size() - 1 ; j > i; j -- )  {
                    if  (skusizelist.get(j).equals(skusizelist.get(i)))  {
                        skusizelist.remove(j);
                    }
                }
            }
            String mcount = String.valueOf(app.getmCount());
            String mprice = String.valueOf(app.getmPrice());
            skumlist.add(mcount);
            skumlist.add(mprice);
            String acount = String.valueOf(app.getaCount());
            String aprice = String.valueOf(app.getaPrice());
            skualist.add(acount);
            skualist.add(aprice);

        }
        skumap.put("color",skucolorlist);
        skumap.put("size",skusizelist);
        skumap.put("mcoandpr",skumlist);
        skumap.put("acoandpr",skualist);

        return JSON.toJSONString(skumap);
    }
    public String closolr(Skusolr skusolr) throws Exception {
        List<Clothing> clo = clothingSolrimpl.clo(skusolr);
        for (Clothing c:clo) {
            String getcSize = c.getcSize();
            skusizelist.add(getcSize);
            for( int i = 0 ; i < skusizelist.size() - 1 ; i ++ )  {
                for( int j = skusizelist.size() - 1 ; j > i; j -- )  {
                    if  (skusizelist.get(j).equals(skusizelist.get(i)))  {
                        skusizelist.remove(j);
                    }
                }
            }
            String getcColor = c.getcColor();
            skucolorlist.add(getcColor);
            for( int i = 0 ; i < skucolorlist.size() - 1 ; i ++ )  {
                for( int j = skucolorlist.size() - 1 ; j > i; j -- )  {
                    if  (skucolorlist.get(j).equals(skucolorlist.get(i)))  {
                        skucolorlist.remove(j);
                    }
                }
            }
            String mcount = String.valueOf(c.getmCount());
            String mprice = String.valueOf(c.getmPrice());
            skumlist.add(mcount);
            skumlist.add(mprice);
            String acount = String.valueOf(c.getcCount());
            String aprice = String.valueOf(c.getcPrice());
            skualist.add(acount);
            skualist.add(aprice);
        }
        skumap.put("color",skucolorlist);
        skumap.put("size",skusizelist);
        skumap.put("mcoandpr",skumlist);
        skumap.put("acoandpr",skualist);
        return JSON.toJSONString(skumap);
    }
    public String cossolr(Skusolr skusolr) throws Exception {
        List<Cosmetics> cos = cossolrimpl.cos(skusolr);
        for (Cosmetics co:cos) {
            String getcSize = co.getCoSize();
            skusizelist.add(getcSize);
            for( int i = 0 ; i < skusizelist.size() - 1 ; i ++ )  {
                for( int j = skusizelist.size() - 1 ; j > i; j -- )  {
                    if  (skusizelist.get(j).equals(skusizelist.get(i)))  {
                        skusizelist.remove(j);
                    }
                }
            }
            String getcColor = co.getCoColor();
            skucolorlist.add(getcColor);
            for( int i = 0 ; i < skucolorlist.size() - 1 ; i ++ )  {
                for( int j = skucolorlist.size() - 1 ; j > i; j -- )  {
                    if  (skucolorlist.get(j).equals(skucolorlist.get(i)))  {
                        skucolorlist.remove(j);
                    }
                }
            }
            String mcount = String.valueOf(co.getmCount());
            String mprice = String.valueOf(co.getmPrice());
            skumlist.add(mcount);
            skumlist.add(mprice);
            String acount = String.valueOf(co.getCoColor());
            String aprice = String.valueOf(co.getCoPrice());
            skualist.add(acount);
            skualist.add(aprice);
        }
        skumap.put("color",skucolorlist);
        skumap.put("size",skusizelist);
        skumap.put("mcoandpr",skumlist);
        skumap.put("acoandpr",skualist);
        return JSON.toJSONString(skumap);
    }
    public String ornsolr(Skusolr skusolr) throws Exception {
        List<Ornaments> orn = ornSolrimpl.orn(skusolr);
        for (Ornaments or:orn) {
            String getcSize = or.getoSize();
            skusizelist.add(getcSize);
            for( int i = 0 ; i < skusizelist.size() - 1 ; i ++ )  {
                for( int j = skusizelist.size() - 1 ; j > i; j -- )  {
                    if  (skusizelist.get(j).equals(skusizelist.get(i)))  {
                        skusizelist.remove(j);
                    }
                }
            }
            String getcColor = or.getoColor();
            skucolorlist.add(getcColor);
            for( int i = 0 ; i < skucolorlist.size() - 1 ; i ++ )  {
                for( int j = skucolorlist.size() - 1 ; j > i; j -- )  {
                    if  (skucolorlist.get(j).equals(skucolorlist.get(i)))  {
                        skucolorlist.remove(j);
                    }
                }
            }
            String mcount = String.valueOf(or.getmCount());
            String mprice = String.valueOf(or.getmPrice());
            skumlist.add(mcount);
            skumlist.add(mprice);
            String acount = String.valueOf(or.getoCount());
            String aprice = String.valueOf(or.getoPrice());
            skualist.add(acount);
            skualist.add(aprice);
        }
        skumap.put("color",skucolorlist);
        skumap.put("size",skusizelist);
        skumap.put("mcoandpr",skumlist);
        skumap.put("acoandpr",skualist);
        return JSON.toJSONString(skumap);
    }
    public String foosolr(Skusolr skusolr) throws Exception {
        List<Food> foo = fooSolrimpl.foo(skusolr);
        for (Food fo:foo) {
            String getcSize = fo.getfSize();
            skusizelist.add(getcSize);
            for( int i = 0 ; i < skusizelist.size() - 1 ; i ++ )  {
                for( int j = skusizelist.size() - 1 ; j > i; j -- )  {
                    if  (skusizelist.get(j).equals(skusizelist.get(i)))  {
                        skusizelist.remove(j);
                    }
                }
            }
            String getcColor = fo.getfColor();
            skucolorlist.add(getcColor);
            for( int i = 0 ; i < skucolorlist.size() - 1 ; i ++ )  {
                for( int j = skucolorlist.size() - 1 ; j > i; j -- )  {
                    if  (skucolorlist.get(j).equals(skucolorlist.get(i)))  {
                        skucolorlist.remove(j);
                    }
                }
            }
            String mcount = String.valueOf(fo.getmCount());
            String mprice = String.valueOf(fo.getmPrice());
            skumlist.add(mcount);
            skumlist.add(mprice);
            String acount = String.valueOf(fo.getfCount());
            String aprice = String.valueOf(fo.getfPrice());
            skualist.add(acount);
            skualist.add(aprice);
        }
        skumap.put("color",skucolorlist);
        skumap.put("size",skusizelist);
        skumap.put("mcoandpr",skumlist);
        skumap.put("acoandpr",skualist);
        return JSON.toJSONString(skumap);
    }

//    public   static   List  removeDuplicate(List list)  {
//        for ( int i = 0 ; i < list.size() -  1 ; i ++ )  {
//
//            for  ( int j = list.size() - 1 ; j > i; j -- )  {
//                if  (list.get(j).equals(list.get(i)))  {
//                    list.remove(j);
//                }
//            }
//        }
//        return list;
//    }

}
