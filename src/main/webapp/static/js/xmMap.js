echarts.registerMap('xiamen', xiamenJson);

var chart = null;
var option = {
    title : {
        text: 'iphone销量',
        subtext: '纯属虚构',
        x:'center'
    },
    tooltip : {
        trigger: 'item'
    },
    legend: {
        orient: 'vertical',
        x:'left',
        data:['iphone3','iphone4','iphone5']
    },
    dataRange: {
        min: 0,
        max: 2500,
        x: 'left',
        y: 'bottom',
        text:['高','低'],           // 文本，默认为数值文本
        calculable : true
    },
    toolbox: {
        show : true,
        orient : 'vertical',
        x: 'right',
        y: 'center',
        feature : {
            mark : {show: true},
            dataView : {show: true, readOnly: false},
            restore : {show: true},
            saveAsImage : {show: true}
        }
    },
    series: [{

        name: 'iphone3',
        type: 'map',
        mapType: 'xiamen',
        roam: true,
        itemStyle:{
            normal:{label:{show:true}},
            emphasis:{label:{show:true}}
        },
        data:[
            {name: '同安区',value: Math.round(Math.random()*1000)},
            {name: '湖里区',value: Math.round(Math.random()*1000)},
            {name: '思明区',value: Math.round(Math.random()*1000)},
            {name: '集美区',value: Math.round(Math.random()*1000)},
            {name: '翔安区',value: Math.round(Math.random()*1000)},
            {name: '海沧区',value: Math.round(Math.random()*1000)},

        ]
    }]

}


/*function loadChartOut() {
    $.getJSON('/maze/rest/view/rain.html', function (data) {
        //上面这个url是重点，组成为：项目名/过滤前缀/Controller中mapping值，当页面加载此js时，它会向后台取数据
        if (data.success1) {
            chartOutChar.showLoading({text: '正在努力的读取数据中...'});
            chartOutChar.setOption({
                series: [
                    {
                        name:'蒸发量',
                        data:data.c_eva
                    },
                    {
                        name:'降水量',
                        data:data.c_rain
                    },
                    {
                        name:'平均温度',
                        data:data.c_avgt
                    }
                ]
            });
            chartOutChar.hideLoading();
        }else {
            alert('提示', data.msg);
        }
    });
}*/


//载入图表
$(function () {
    chart = echarts.init(document.getElementById('xmMap'));
    chart.setOption(option);
    //loadChartOut();
    window.addEventListener('resize', function () {
        chart.resize();
    });
});