var chart2 = null;

var option2 = {
    title : {
        text: '厦门市商品房交易信息',
        subtext: '数据来自厦门市国土资源与房产管理局',
        x: 'left',
        align: 'right'
    },
    grid: {
        bottom: 80
    },

    tooltip : {
        trigger: 'axis',
        axisPointer: {
            type: 'cross',
            animation: false,
            label: {
                backgroundColor: '#505765'
            }
        }
    },
    legend: {
        data:['住宅套数','总套数','',
            '住宅面积','总面积'],
        x: 'right'
    },
    dataZoom: [
        {
            show: true,
            realtime: true,
            start: 50,
            end: 100
        },
        {
            show: true,
            type: 'inside',//slide
            realtime: true,
            xAxisIndex: [0,1],
            start: 50,
            end: 100
        }
    ],
    xAxis : [
        {
            type : 'category',
            // boundaryGap : [0,0.01],
            axisLine: {onZero: false}
        },
        {
            type : 'category',
            axisLine: {show:false},
            axisTick: {show:false},
            axisLabel: {show:false},
            splitArea: {show:false},
            splitLine: {show:false}
            //axisLine: {onZero: false}
        }
    ],
    yAxis: [
        {
            type: 'value',
            scale:true,
            axisLabel : {
                formatter: '{value} 套'
            },
            boundaryGap: [0.01, 0.01]
        },
        {
            type: 'value',
            scale:true,
            axisLabel : {
                formatter: '{value}m2'
            },
            boundaryGap: [0.01, 0.01]
        }
    ],

    series: [
        {
            name:'总套数',
            type:'bar',
            itemStyle: {normal: {color:'#81c0c0',label:{show:true},barBorderRadius:5}}
        },
        {
            name:'住宅套数',
            type:'bar',
            xAxisIndex:1,
            itemStyle: {normal: {color:'#408080',label:{show:true},barBorderRadius:5}}
        },

        {
            name:'总面积',
            type:'bar',
            itemStyle: {normal: {color:'#ffbb77',label:{show:true},barBorderRadius:5}},
            yAxisIndex:1

        },
        {
            name:'住宅面积',
            type:'bar',
            itemStyle: {normal: {color:'#ea7500', label:{show:true},barBorderRadius:5}},
            yAxisIndex:1,
            xAxisIndex:1,
        },{
            name: 'GDP占比',
            type: 'pie',
            center: ['80%', '20%'],
            radius: '28%',
            z: 100
        }
    ]

};

function loadData(name) {
    $.getJSON('/xmtfj/index/spfa/'+name, function (data) {
        if (data.state) {
            chart2.showLoading({text: '正在努力的读取数据中...'});
            chart2.setOption({
                xAxis : [
                    {
                        data : data.axis
                    },
                    {
                        data : data.axis
                    }
                ],
                series: [
                    {
                        name:'住宅套数',
                        data: data.sellSum
                    },
                    {
                        name:'总套数',
                        data: data.totalSum
                    },
                    {
                        name:'住宅面积',
                        data: data.sellArea
                    },
                    {
                        name:'总面积',
                        data: data.totalArea
                    },
                    {
                        name: '占比',
                        data: []
                    }
                ]
            });

            chart2.hideLoading();
        }else {
            alert('提示', data.msg);
        }
    });
}


//载入图表
$(function () {
    chart2 = echarts.init(document.getElementById('chart3_2'));
    chart2.setOption(option2);
    loadData('厦门市');
    window.addEventListener('resize', function () {
        chart2.resize();
    });
});