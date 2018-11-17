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

    /**
     * 家电
     * @param skusolr
     * @return
     * @throws Exception
     */
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
            String mcountapp = String.valueOf(app.getmCount());
            System.out.println(mcountapp);
            String mpriceapp = String.valueOf(app.getmPrice());
            System.out.println(mpriceapp);
            skumlist.add(mcountapp);
            skumlist.add(mpriceapp);
            for  ( int  i = 0 ; i < skumlist.size() - 1 ; i ++ )  {
                for  ( int j = skumlist.size() - 1 ; j > i; j -- )  {
                    if  (skumlist.get(j).equals(skumlist.get(i)))  {
                        skumlist.remove(j);
                    }
                }
            }
            String acount = String.valueOf(app.getaCount());
            String aprice = String.valueOf(app.getaPrice());
            skualist.add(acount);
            skualist.add(aprice);

        }
        skumap.put("acolor",skucolorlist);
        skumap.put("asize",skusizelist);
        skumap.put("mcoandpr",skumlist);
        skumap.put("acoandpr",skualist);
        return JSON.toJSONString(skumap);
    }

    /**
     * 服装
     * @param skusolr
     * @return
     * @throws Exception
     */
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
            String mcountclo = String.valueOf(c.getmCount());
            System.out.println(mcountclo);
            String mpriceclo = String.valueOf(c.getmPrice());
            System.out.println(mpriceclo);
            skumlist.add(mcountclo);
            skumlist.add(mpriceclo);
            for( int i = 0 ; i < skumlist.size() - 1 ; i ++ )  {
                for( int j = skumlist.size() - 1 ; j > i; j -- )  {
                    if  (skumlist.get(j).equals(skumlist.get(i)))  {
                        skumlist.remove(j);
                    }
                }
            }
            String ccount = String.valueOf(c.getcCount());
            String cprice = String.valueOf(c.getcPrice());
            skualist.add(ccount);
            skualist.add(cprice);
        }
        skumap.put("ccolor",skucolorlist);
        skumap.put("csize",skusizelist);
        skumap.put("mcoandpr",skumlist);
        skumap.put("ccoandpr",skualist);
        return JSON.toJSONString(skumap);
    }

    /**
     * 化妆品
     * @param skusolr
     * @return
     * @throws Exception
     */
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
            String mcountcos = String.valueOf(co.getmCount());
            String mpricecos = String.valueOf(co.getmPrice());
            skumlist.add(mcountcos);
            skumlist.add(mpricecos);
            for( int i = 0 ; i < skumlist.size() - 1 ; i ++ )  {
                for( int j = skumlist.size() - 1 ; j > i; j -- )  {
                    if  (skumlist.get(j).equals(skumlist.get(i)))  {
                        skumlist.remove(j);
                    }
                }
            }
            String cocount = String.valueOf(co.getCoColor());
            String coprice = String.valueOf(co.getCoPrice());
            skualist.add(cocount);
            skualist.add(coprice);
        }
        skumap.put("cocolor",skucolorlist);
        skumap.put("cosize",skusizelist);
        skumap.put("mcoandpr",skumlist);
        skumap.put("cocoandpr",skualist);
        return JSON.toJSONString(skumap);
    }

    /**
     * 首饰
     * @param skusolr
     * @return
     * @throws Exception
     */
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
            String mcountorn = String.valueOf(or.getmCount());
            String mpriceorn = String.valueOf(or.getmPrice());
            skumlist.add(mcountorn);
            skumlist.add(mpriceorn);
            for( int i = 0 ; i < skumlist.size() - 1 ; i ++ )  {
                for( int j = skumlist.size() - 1 ; j > i; j -- )  {
                    if  (skumlist.get(j).equals(skumlist.get(i)))  {
                        skumlist.remove(j);
                    }
                }
            }
            String ocount = String.valueOf(or.getoCount());
            String oprice = String.valueOf(or.getoPrice());
            skualist.add(ocount);
            skualist.add(oprice);
        }
        skumap.put("ocolor",skucolorlist);
        skumap.put("osize",skusizelist);
        skumap.put("mcoandpr",skumlist);
        skumap.put("ocoandpr",skualist);
        return JSON.toJSONString(skumap);
    }

    /**
     * 食品
     * @param skusolr
     * @return
     * @throws Exception
     */
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
            String mcountfoo = String.valueOf(fo.getmCount());
            String mpricefoo = String.valueOf(fo.getmPrice());
            skumlist.add(mcountfoo);
            skumlist.add(mpricefoo);
            for( int i = 0 ; i < skumlist.size() - 1 ; i ++ )  {
                for( int j = skumlist.size() - 1 ; j > i; j -- )  {
                    if  (skumlist.get(j).equals(skumlist.get(i)))  {
                        skumlist.remove(j);
                    }
                }
            }
            String fcount = String.valueOf(fo.getfCount());
            String fprice = String.valueOf(fo.getfPrice());
            skualist.add(fcount);
            skualist.add(fprice);
        }
        skumap.put("fcolor",skucolorlist);
        skumap.put("fsize",skusizelist);
        skumap.put("mcoandpr",skumlist);
        skumap.put("fcoandpr",skualist);
        return JSON.toJSONString(skumap);
    }
//    集合排重
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
