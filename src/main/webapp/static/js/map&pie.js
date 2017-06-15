echarts.registerMap('xiamen', xiamenJson);
var chart_map = null;
var option_map = {
    title : {
        text: '商品房交易热度图',
        subtext: '(按成交量)',
        x:'left'
    },
    tooltip : {
        trigger: 'item',
        formatter: "{a} <br/>{b} : {c} (套)"
    },
    visualMap: {
        min: 0,
        max: 500,
        x: 'left',
        y: 'bottom',
        text:['高','低'],           // 文本，默认为数值文本
        calculable : true
    },
    series: [{
        name: '成交量',
        type: 'map',
        map: 'xiamen',
        label: {
            normal: {
                show: true
            },
            emphasis: {
                show: true
            }
        },
        roam: false,
        itemStyle:{
            normal:{label:{show:false}},
            emphasis:{label:{show:true}}
        }
    }]

};


var chart_pie = null;
var option_pie = {
    title : {
        text: '商品房交易热度图',
        subtext: '(按成交面积)',
        x:'left'
    },
    tooltip : {
        trigger: 'item',
        formatter: "{a} <br/>{b} : {c} ({d}%)"
    },
    legend: {
        orient: 'vertical',
        left: 'right',
        data: ['思明区','湖里区','集美区','海沧区','同安区','翔安区']
    },
    series : [
        {
            name: '成交面积',
            type: 'pie',
            radius : '55%',
            center: ['50%', '60%'],
            itemStyle: {
                emphasis: {
                    shadowBlur: 10,
                    shadowOffsetX: 0,
                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
            }
        }
    ]
};


function loadChartOut(limit) {
    $.getJSON('/xmtfj/index/spfp/'+limit, function (data) {
        if (data.state) {
            chart_map.showLoading({text: '正在努力的读取数据中...'});
            chart_pie.showLoading({text: '正在努力的读取数据中...'});

            chart_map.setOption({
                series: [
                    {
                        data:data.nvSum
                    }
                ]
            });

            chart_pie.setOption({
                series: [
                    {
                        data:data.nvArea
                    }
                ]
            });
            chart_pie.hideLoading();
            chart_map.hideLoading();

        }else {
            alert('提示', data.msg);
        }
    });

}

//载入图表
$(function () {
    chart_map = echarts.init(document.getElementById('chart1_1'));
    chart_pie = echarts.init(document.getElementById('chart1_2'));
    chart_pie.setOption(option_pie);
    chart_map.setOption(option_map);
    loadChartOut(10);
    window.addEventListener('resize', function () {
        chart_map.resize();
        chart_pie.resize();
    });
});