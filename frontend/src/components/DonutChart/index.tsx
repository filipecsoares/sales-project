import axios from 'axios';
import Chart from 'react-apexcharts';
import { SaleSum } from 'types/sale';
import { BASE_URL } from 'utils/request';

type ChartData = {
    labels: string[];
    series: number[];
}

const DonutChart = () => {

    let chartData: ChartData = {
        labels: [],
        series: []
    };

    axios.get(`${BASE_URL}/sales/amount-by-seller`).then(res => {
        const data = res.data as SaleSum[];
        chartData.labels = data.map(item => item.sellerName);
        chartData.series = data.map(item => item.sum);
        console.log(res.data);
    });
    
    const options = {
        legend: {
            show: true
        }
    }

    return (
        <Chart 
            options={{...options, labels: chartData.labels}} 
            series={chartData.series} 
            type="donut" 
            height="240"
        />
    );
}

export default DonutChart;